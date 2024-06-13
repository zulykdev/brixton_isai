package com.brixton.gestionusuario.model;

public enum PermissionType {
    CREATE("CREATE"),
    UPDATE("UPDATE"),
    LIST("LIST"),
    DELETE("DELETE");
    private String permission;
    PermissionType(String permission){ this.permission=permission;    }
    String getPermission(){ return this.permission;    }
}
