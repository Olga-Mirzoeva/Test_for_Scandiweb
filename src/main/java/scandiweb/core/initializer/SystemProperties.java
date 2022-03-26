package scandiweb.core.initializer;

public enum SystemProperties {
    BROWSER_TYPE("scandiweb.browserName"),
    URL("scandiweb.url"),
    TIMEOUT("scandiweb.timeout");

    private String systemName;

    SystemProperties(String systemName) {
        this.systemName = systemName;
    }

    public String getSystemName() {
        return systemName;
    }
}
