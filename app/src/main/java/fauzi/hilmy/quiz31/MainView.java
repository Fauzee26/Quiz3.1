package fauzi.hilmy.quiz31;

import fauzi.hilmy.quiz31.Base.BaseView;

public interface MainView extends BaseView {
    void onSuccess(String result);
    void onError(String msg);
}
