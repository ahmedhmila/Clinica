package dao;

import java.util.List;

import AcquiClini.Chambre;



public interface IGestionChambres {
	public List<Chambre>listeDesChambres();
	public List<Chambre>chambresno();
	public List<Chambre>occchambre(String nn );
	public List<Chambre>VIDchambre(String VC );
}
