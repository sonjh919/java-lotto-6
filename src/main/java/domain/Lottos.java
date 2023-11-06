package domain;

import java.util.List;

public class Lottos {
    private final List<Lotto> lottos;

    public Lottos(List<Lotto> lottos){
        this.lottos = lottos;
    }

    public void outputLottos() {
        lottos.forEach(Lotto::outputLotto);
    }

    public List<Lotto> get() {
        return List.copyOf(lottos);
    }

}
