import java.util.Date;

public class Tweet {
	private String username;
	private String text;
	private Date date;

	public Tweet(String username, String text, Date date) {
		this.username = username;
		this.text = text;
		this.date = date;
	}

	public String getUsername() {
		return username;
	}

	public String getText() {
		return text;
	}

	public Date getDate() {
		return date;
	}

	@Override
	public String toString() {
		return "Username: " + this.username + " - " + this.text + " - " + this.date.toString();
	}
}
