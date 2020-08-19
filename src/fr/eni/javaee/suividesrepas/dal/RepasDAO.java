package fr.eni.javaee.suividesrepas.dal;

import java.time.LocalDate;
import java.util.List;

import fr.eni.javaee.suividesrepas.BusinessException;
import fr.eni.javaee.suividesrepas.bo.Repas;

public interface RepasDAO {
	public void insert(Repas repas) throws BusinessException;
	public List<Repas> select() throws BusinessException;
	public List<Repas> select(LocalDate dateRecherchee) throws BusinessException;
	public List<Repas> select(int page) throws BusinessException;
}
