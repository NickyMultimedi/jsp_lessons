package be.multimedi.jsp.guestbook;

import java.util.List;

public interface GuestBookRepo {
    void submitNewEntry(GuestBookEntry entry);
    List<GuestBookEntry> getAllEntries();
}
