package be.multimedi.jsp.guestbook;

import be.multimedi.jsp.handlers.ConnectionHandler;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class MariaDBRepoImpl implements GuestBookRepo {
    private final String NEW_ENTRY_QUERY = "Insert into GuestBook (Date, Name, Message) values (?, ?, ?);";
    private final String GET_ALL_QUERY = "select * from GuestBook;";
    ConnectionHandler handler;

    public MariaDBRepoImpl() {
        handler = ConnectionHandler.getInstance();
    }

    @Override
    public void submitNewEntry(GuestBookEntry entry) {
        try (PreparedStatement prepStatement = handler.prepareStatement(NEW_ENTRY_QUERY)) {

            prepStatement.setTimestamp(1, Timestamp.valueOf(entry.getDate()));
            prepStatement.setString(2, entry.getName());
            prepStatement.setString(3, entry.getMessage());

            prepStatement.executeUpdate();

        } catch (SQLException sqle) {
            throw new RuntimeException(sqle);
        }
    }

    @Override
    public List<GuestBookEntry> getAllEntries() {
        try (
                PreparedStatement prepStatement = handler.prepareStatement(GET_ALL_QUERY);
                ResultSet results = prepStatement.executeQuery();
        ) {

        List<GuestBookEntry> guestBook = fillGuestBook(results);
        return guestBook;

        } catch (SQLException sqle) {
            throw new RuntimeException();
        }
    }

    private GuestBookEntry createEntry(ResultSet results) throws SQLException {
        GuestBookEntry entry = new GuestBookEntry();

        Timestamp time = results.getTimestamp("Date");

        entry.setId(results.getInt("id"));
        entry.setName(results.getString("Name"));
        entry.setMessage(results.getString("Message"));
        entry.setDate(time.toLocalDateTime());

        return entry;
    }

    private List<GuestBookEntry> fillGuestBook(ResultSet results) throws SQLException {
        List<GuestBookEntry> entries = new ArrayList<>();
        while (results.next()) {
            GuestBookEntry entry = createEntry(results);
            entries.add(entry);
        }

        return entries;
    }

}
