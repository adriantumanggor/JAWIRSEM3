package project.Data.Source;
import project.Data.Model.User;

public class UserSessionRepository implements SessionRepository<User> {
    public User session;

    public void setSession(User session){
        this.session = session;
    }

    public User getSession(){
        return this.session;
    }

    public void destroySession(){
        this.session = null;
    }

    public void updateSession(User session){
        this.session = session;
    }
}
