package ateriointi;

public class Opiskelija extends AterioivaOtus{

	@Override
	public Juoma createJuoma() {
		return new Maito();
	}

	@Override
	public Ruoka createRuoka() {
		return new Salaatti();
	}

}
