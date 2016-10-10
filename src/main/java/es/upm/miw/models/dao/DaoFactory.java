package es.upm.miw.models.dao;

public abstract class DaoFactory {

    public static DaoFactory factory = null;

    public static void setFactory(DaoFactory factory) {
        DaoFactory.factory = factory;
    }

    public static DaoFactory getFactory() {
        assert factory != null;
        return factory;
    }

    public abstract BookDao getUserDao();

    public abstract AuthorDao getAddressDao();

    public abstract ContactDao getCategoryDao();

    public abstract StyleDao getPhoneDao();

    public abstract ThemeDao getVehicleDao();

}
