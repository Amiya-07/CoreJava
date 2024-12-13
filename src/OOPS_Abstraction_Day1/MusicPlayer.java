package OOPS_Abstraction_Day1;

public class MusicPlayer implements AdvancedMediaPlayer
{
	String title;
	
	
	public MusicPlayer(String title) {
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
		System.out.println("Playing Music : "+this.title);	
	}

	@Override
	public void stop() {
		System.out.println(this.title+" stopped ");
		
	}

	@Override
	public void pause() {
		System.out.println(this.title+" Paused");
		
	}
	
}
/*

Create a class MusicPlayer that implements AdvancedMediaPlayer 
and provides implementations for the methods, and write some standard printing message.
*/