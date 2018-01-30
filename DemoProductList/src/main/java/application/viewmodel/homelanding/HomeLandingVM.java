package application.viewmodel.homelanding;

import application.viewmodel.common.LogoVM;

/**
 * Created by HoangDuyHao on 1/21/2018.
 */
public class HomeLandingVM {
    private LogoVM logo;
    private MenuItemVM menu;

    public MenuItemVM getMenu() {
        return menu;
    }

    public void setMenu(MenuItemVM menu) {
        this.menu = menu;
    }

    public LogoVM getLogo() {
        return logo;
    }

    public void setLogo(LogoVM logo) {
        this.logo = logo;
    }
}
