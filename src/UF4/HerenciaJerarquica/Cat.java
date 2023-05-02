package UF4.HerenciaJerarquica;



public class Cat extends Animal {


        // Own behavior
        private void meow() {
            System.out.println("meow '" + getId() + "' is meow");
        }

        // Overriding super class behavior
        @Override
        public void sound() {
            meow();
        }

}
