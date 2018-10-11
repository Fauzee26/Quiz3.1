package fauzi.hilmy.quiz31;

import fauzi.hilmy.quiz31.Base.BasePresenter;

public class MainPresenter implements BasePresenter<MainView> {
    private MainView view;
    private double result;

    public void plus(String bil1, String bil2) {
        if (!bil1.equals("") && !bil2.equals("")) {
            result = Double.parseDouble(bil1) + Double.parseDouble(bil2);
            view.onSuccess("Result is " + result);
        } else {
            view.onError("Number can't be null");
        }
    }

    public void minus(String bil1, String bil2) {
        if (!bil1.equals("") && !bil2.equals("")) {
            result = Double.parseDouble(bil1) - Double.parseDouble(bil2);
            view.onSuccess("Result is " + result);
        } else {
            view.onError("Number can't be null");
        }
    }

    public void times(String bil1, String bil2) {
        if (!bil1.equals("") && !bil2.equals("")) {
            result = Double.parseDouble(bil1) * Double.parseDouble(bil2);
            view.onSuccess("Result is " + result);
        } else {
            view.onError("Number can't be null");
        }
    }

    public void divides(String bil1, String bil2) {
        if (!bil1.equals("") && !bil2.equals("")) {
            result = Double.parseDouble(bil1) / Double.parseDouble(bil2);
            view.onSuccess("Result is " + result);
        } else {
            view.onError("Number can't be null");
        }
    }

//    public void clear(Integer bil1, Integer bil2) {
//        if (bil1 != null || bil2 != null) {
//            view.onError("nothing can be deleted");
//        } else {
//            Integer result = bil1 + bil2;
//            view.onSuccess("Result is " + result);
//        }
//    }

    @Override
    public void onAttach(MainView v) {
        view = v;
    }

    @Override
    public void onDettach() {
        view = null;
    }
}
