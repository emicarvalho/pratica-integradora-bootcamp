package aula02;

public class Pessoa {
    String name;
    int age;
    String ID;
    double peso;
    double altura;

    public Pessoa() {}

    public Pessoa(String name, int age, String ID){
        this.name = name;
        this.age = age;
        this.ID = ID;
    }

    public Pessoa(String name, int age, String ID, double peso, double altura) {
        this.name = name;
        this.age = age;
        this.ID = ID;
        this.peso = peso;
        this.altura = altura;
    }

    public double calcularIMC() {
        double calculo = this.peso/(Math.pow(this.altura,2));
        if(calculo < 20) {
            return -1;
        }else if(calculo > 25) {
            return 1;
        } else {
            return 0;
        }
    }

    public boolean ehMaiorIdade() {
        if(age >= 18) {
            return true;
        } else {
            return false;
        }
    }

    // @Override
    //public String toString() {
      //  return name, age, ID, weight, height
    //}
}
