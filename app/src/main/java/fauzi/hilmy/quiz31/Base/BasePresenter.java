package fauzi.hilmy.quiz31.Base;

public interface BasePresenter <T extends BaseView> {
    void onAttach(T v);
    void onDettach();
}