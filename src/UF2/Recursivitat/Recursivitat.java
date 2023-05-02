package UF2.Recursivitat;

public class Recursivitat{
	public static void main(String args[]) {
		Recursivitat recursividad = new Recursivitat();
		recursividad.recursividad(33);
	}
		public void recursividad(int x){
			if (x >=0){
				if (x % 2 == 0){
					System.out.println("El nombre " + x + " és parell");
				}
				else{
					System.out.println("El nombre " + x + " és senar");
				}
				recursividad(x - 1);
			}
		}
	}