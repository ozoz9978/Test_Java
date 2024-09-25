package Service;
import VO.Man;

public interface SpeakableService {
	public boolean insert(Man man);
	public Man[]selectAll();
	public int getCount();
}
