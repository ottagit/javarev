package Thread;

public class Branch {
	private String var1;
	private String var2, var3;
	private int medals;
	private boolean hasRecord;
	private int current_compe;
	
	public Branch(String var1, String var2, String var3, int medals)
	{
		this.var1 = var1;
		this.var2 = var2;
		this.var3 = var3;
		this.medals = medals;
	}
	
	//setter methods
	
	public void setNane1(String name1)
	{
		this.var1 = name1;
	}
	public void setName2(String name2)
	{
		this.var2 = name2;
	}
	public void setName3(String country)
	{
		this.var3 = country;
	}
	public void setMedal(int medal)
	{
		this.medals = medal;
	}
	
	//getter methods
	
	public String getName1()
	{
		return var1;
	}
	public String getName2()
	{
		return var2;
	}
	public String getName3()
	{
		return var3;
	}
	public int getMedal()
	{
		return medals;
	}
	
	public boolean recordHistory(int compez, String yr, String name1, String name2)
	{
		if(compez != 0)
			for(compez = 1;compez<=current_compe;compez++)
			{
				System.out.println(name1 + " " + name2 + " " + "broke record in the year " + yr);
				System.out.println("Current number of medals is " + compez);
			}
		return hasRecord;
	}
	
	

}
