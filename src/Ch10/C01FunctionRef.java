package Ch10;

class Controller{
	Module module;

	public Module getModule() {
		return module;
	}

	public void setModule(Module module) {
		this.module = module;
	}
	
	
}

class Module{
	Module(){
		System.out.println("Module생성 this : " + this);
	}
		void Func1() {
			System.out.println("Module's Func1()");	
		}
		void Func2() {
			System.out.println("Module's Func2()");	
		}
		void Func3() {
			System.out.println("Module's Func3()");	
		}
}

public class C01FunctionRef {

	public static void main(String[] args) {

		Controller c = new Controller();
		c.module.Func1();
		c.module.Func2();
		c.module.Func3();
		System.out.println("Controller module : " + c.getModule());
	}

}
