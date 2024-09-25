package fitness.service;
import fitness.vo.Fitness;


public interface FitnessServiceImpl {
	public boolean insert(Fitness fitness);
	public Fitness selectOne(int id);
	public boolean update(Fitness fitness);
	public boolean delete (int id);
	public Fitness[] selectAll();
	public int getCount();
	}
