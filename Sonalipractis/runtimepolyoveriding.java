package Sonalipractis;


 class polymorover 
{	
	void Show(int a) 
		{
		System.out.println( " this is a sonali");
		}
}
		class runtimepolyoveriding extends polymorover
		{
			void Show() {
				System.out.println( " this is a patil");
				}
			public static void main(String[] args) {
				runtimepolyoveriding sp=new  runtimepolyoveriding();
				sp.Show(9);
				sp.Show();
			}
		}

