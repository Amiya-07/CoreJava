package OOPS_Abstraction_Day1;

public class VideoPlayer implements AdvancedMediaPlayer
{
	String title;
	
	
	public VideoPlayer(String title) {
		super();
		if(title.equals(""))
		{
			System.err.println("Invalid Title");
			System.exit(0);
		}
		this.title = title;
	}

	@Override
	public void play() 
	{
		System.out.println(" Playing Video "+this.title);	
	}

	@Override
	public void stop() {
		System.out.println(" Video Stopped "+this.title);
		
	}

	@Override
	public void pause() {
		System.out.println(" Video Paused "+this.title);
		
	}

}
/*
Create a class VideoPlayer that implements AdvancedMediaPlayer and 
provides implementations for the methods. and write some standard printing message.
*/