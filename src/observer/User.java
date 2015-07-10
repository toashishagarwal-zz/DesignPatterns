package observer;

public class User implements Observer {

	private String article;
	private Subject blog;

	public void setSubject(Subject blog) {
		this.blog = blog;
		article = "No New Article!";
	}

	@Override
	public void update() {
		System.out.println("State change reported by Subject. This is notification to an observer");
		article = (String) blog.getUpdate();
	}

	public String getArticle() {
		return article;
	}
}
