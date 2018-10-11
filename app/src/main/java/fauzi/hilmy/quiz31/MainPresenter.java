package fauzi.hilmy.quiz31;

import fauzi.hilmy.quiz31.Base.BasePresenter;

public class MainPresenter implements BasePresenter<MainView> {
    private MainView view;

    public void plus(Integer bil1, Integer bil2) {
        if (bil1 == null || bil2 == null) {
            view.onError("Number can't be null");
        } else {
            Integer result = bil1 + bil2;
            view.onSuccess("Result is " + result);
        }
    }

    public void minus(Integer bil1, Integer bil2) {
        if (bil1 == null || bil2 == null) {
            view.onError("Number can't be null");
        } else {
            Integer result = bil1 - bil2;
            view.onSuccess("Result is " + result);
        }
    }

    public void times(Integer bil1, Integer bil2) {
        if (bil1 == null || bil2 == null) {
            view.onError("Number can't be null");
        } else {
            Integer result = bil1 * bil2;
            view.onSuccess("Result is " + result);
        }
    }

    public void divides(Integer bil1, Integer bil2) {
        if (bil1 == null || bil2 == null) {
            view.onError("Number can't be null");
        } else {
            Integer result = bil1 / bil2;
            view.onSuccess("Result is " + result);
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
