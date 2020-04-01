package app.inuk.drinkorderer;

public enum DrinkListType
{
    History("Historie"),
    Orders("Ordrer");

    DrinkListType(String rawValue)
    {
        this.rawValue = rawValue;
    }

    static DrinkListType fromString(String rawValue)
    {
        switch (rawValue) {
            case "Historie": return History;
            case "Ordrer": return Orders;
        }
    }

    String rawValue;
}
