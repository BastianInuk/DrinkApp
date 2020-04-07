package app.inuk.drinkorderer;


public enum DrinkListType
{
    History("History"),
    Orders("Order"),
    Error("Error");

    DrinkListType(String rawValue)
    {
        this.rawValue = rawValue;
    }

    static DrinkListType fromString(String rawValue)
    {
        switch (rawValue) {
            case "History": return History;
            case "Order": return Orders;
            default: return Error;
        }
    }

    String rawValue;
}
