package Veterinaria;

public class Avicolas extends Animalito implements Cuidados {
  private String tipoPlumaje;

  public Avicolas(String especie, int edad, String nombre, double peso, String tipoPlumaje)
      throws PesoInsuficienteException {
    super(especie, edad, nombre, peso);

    if (peso < 1.0) {
      throw new PesoInsuficienteException(
          "Error: Un animal avícola debe tener al menos 1kg de peso. Peso recibido: " + peso + "kg");
 }

  this.setTipoPlumaje(tipoPlumaje); // Usamos setter para normalizar
  }

  public String getTipoPlumaje() {
    return tipoPlumaje;
  }

  @Override
  public double calcularCostoCuidado(double costoBase) { // Corregido: sin int edadAnimal
    // Usamos getEdad() para acceder al campo privado del padre
    double incrementoEdad = this.getEdad() * 0.05;

    double porcentajePlumaje;
    if (tipoPlumaje.equalsIgnoreCase("EXOTICO")) {
      porcentajePlumaje = 0.4;
    } else if (tipoPlumaje.equalsIgnoreCase("COLORIDO")) {
      porcentajePlumaje = 0.3;
    } else {
      porcentajePlumaje = 0.2;
    }

    double costoConEdad = costoBase * (1 + incrementoEdad);
    return costoConEdad * (1 + porcentajePlumaje);
  }

  public void setTipoPlumaje(String tipoPlumaje) {
    this.tipoPlumaje = tipoPlumaje.toUpperCase();
  }

  @Override
  public String verTipoDeAnimal() {
    return "🐦";
  }

  @Override
  public String toString() {
    // Usamos Getters para respetar encapsulamiento
    return super.toString() + "\t" + tipoPlumaje + " plumaje"; 
  }
}