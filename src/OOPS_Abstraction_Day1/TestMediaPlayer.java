package OOPS_Abstraction_Day1;

public class TestMediaPlayer 
{
	public static void main(String []args)
	{
		AdvancedMediaPlayer p = new MusicPlayer("Tum hi ho");
		p.play();
		p.pause();
		p.stop();
		
		System.out.println("=====================Video Details====================");
		
		AdvancedMediaPlayer p1 = new VideoPlayer("");
		p1.play();
		p1.pause();
		p1.stop();
	}
}
