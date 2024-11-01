package project.Modul.Login;
import project.Data.Source.SessionRepository;
import project.Base.BasePresenter;
import project.Data.Model.User;

public class LoginPresenter implements BasePresenter {
    public SessionRepository<User> sessionRepository;
    public LoginView view;

    public LoginPresenter(LoginView view, SessionRepository<User> sessionRepository){
        this.view = view;
        this.sessionRepository = sessionRepository;
    }
}
