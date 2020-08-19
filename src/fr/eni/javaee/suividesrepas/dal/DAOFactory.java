package fr.eni.javaee.suividesrepas.dal;

public abstract class DAOFactory {
	
	public static RepasDAO getRepasDAO()
	{
		return new RepasDAOJdbcImpl();
	}
}
	