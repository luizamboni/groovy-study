
import Duck

class Chester {

  private Duck bird;

  Chester() {
    this.bird = new Duck();
  }

  String quark() {
    bird.quark()
  }
}