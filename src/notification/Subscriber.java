package notification;

public interface Subscriber {
    NotificationTypeEnum type = null;
    public void removeSubscription();
    public void getNotificationType();
    public NotificationTypeEnum setNotificationType();
}
