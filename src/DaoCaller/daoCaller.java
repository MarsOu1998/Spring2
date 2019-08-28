package DaoCaller;

import Interface.IDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class daoCaller {
    private IDAO dao;

    public IDAO getDao() {
        return dao;
    }

    public void setDao(IDAO dao) {
        this.dao = dao;
    }

    public  void callDao(String account,String password) {
        dao.Login(account,password);
    }


}
