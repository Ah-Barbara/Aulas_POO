class Funcionario {
    
    private float salario;
    
    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        if (this.salario > salario) {
            System.out.println("Vou reclamar no Sindicato");
        } else {    
            this.salario = salario;
        }
    }
    
}

public class Empresa {

    public static void main(String [] args) {
        Funcionario joao = new Funcionario();
        joao.setSalario(1200f);
        System.out.println(joao.getSalario());
        joao.setSalario(1400f);
        System.out.println(joao.getSalario());
        joao.setSalario(1000f);
        System.out.println(joao.getSalario());
    }
    
}
