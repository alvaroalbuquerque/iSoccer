package Methods;

import Running.System;

public class SystemMethod {
    System system;

    public SystemMethod(System system) {
        this.system = system;
    }

    public void runSystem(){
        if(system.menusMethod.showMenuSignIn(system)){
            system.menusMethod.showMenuISoccer(system);
        }else{
            system.message.showInvalidInput();
        }
    }
}
