package Dao;
import java.sql.*;
import Datasource.DataConnection;
import java.util.*;
import Model.Currency;

public class CurrencyDao {
    public Double getTargetSource(String name) {
        double exchangeRate = 0;
        Connection conn = DataConnection.getConnection();
        String sql = "SELECT conversion_rate FROM currencies WHERE abbreviation = ?";

        try {
            Statement s = conn.createStatement();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, name);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                exchangeRate = rs.getDouble(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return exchangeRate;
    }
    public ArrayList<String> getTargets() {
        ArrayList<String> currencies = new ArrayList<>();
        Connection conn = DataConnection.getConnection();
        String sql = "SELECT abbreviation FROM currencies";

        try {
            Statement s = conn.createStatement();
            PreparedStatement ps = conn.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                currencies.add(rs.getString(1));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return currencies;
    }
}
