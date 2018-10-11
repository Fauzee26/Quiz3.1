package fauzi.hilmy.quiz31;

import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity implements MainView {

    @BindView(R.id.edt2)
    TextInputEditText edt2;
    @BindView(R.id.edt1)
    TextInputEditText edt1;
    @BindView(R.id.btnplus)
    Button plus;
    @BindView(R.id.btnminus)
    Button minus;
    @BindView(R.id.btntimes)
    Button times;
    @BindView(R.id.btndivided)
    Button divides;
    @BindView(R.id.btnclear)
    Button clear;
    private MainPresenter presenter;
    String num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        edt1.requestFocus();
        presenter = new MainPresenter();
        onAttachView();
    }


    @OnClick({R.id.btnplus, R.id.btnminus, R.id.btntimes, R.id.btndivided, R.id.btnclear})
    public void onViewClicked(View view) {
        num1 = edt1.getText().toString();
        num2 = edt2.getText().toString();
        switch (view.getId()) {
            case R.id.btnplus:
                presenter.plus(num1, num2);
                break;
            case R.id.btnminus:
                presenter.minus(num1, num2);
                break;
            case R.id.btntimes:
                presenter.times(num1, num2);
                break;
            case R.id.btndivided:
                presenter.divides(num1, num2);
                break;
            case R.id.btnclear:
                edt1.setText("");
                edt2.setText("");
                edt1.requestFocus();
                break;
        }
    }

    @Override
    public void onSuccess(String result) {
        Toast.makeText(this, result, Toast.LENGTH_SHORT).show();
        Log.e("Result: ", result);
    }

    @Override
    public void onError(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
        Log.e("Result: ", msg);
    }

    @Override
    public void onAttachView() {
        presenter.onAttach(this);
    }

    @Override
    public void onDettachView() {

    }
}
