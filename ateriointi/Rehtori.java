package ateriointi;

public class Rehtori extends AterioivaOtus{

	@Override
	public Juoma createJuoma() {
		return new Mehu();
	}

	@Override
	public Ruoka createRuoka() {
		return new Lasagne();
	}
	
}
