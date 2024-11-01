package project.Data.Source;

public interface SessionRepository<T> {
    public String SHARED_PREFERENCE_NAME = "";

    public void setSession(T t);
    public T getSession();
    public void destroySession();
    public void updateSession(T t);
}
