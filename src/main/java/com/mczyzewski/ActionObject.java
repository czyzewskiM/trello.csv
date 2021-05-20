package com.mczyzewski;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class ActionObject {
    public String id;
    public String idMemberCreator;
    public Data data;
    public String type;
    public Date date;
    public MemberCreator memberCreator;
}

@JsonIgnoreProperties(ignoreUnknown = true)
class MemberCreator {
    public String id;
    public String fullName;
    public String initials;
    public String username;
    public String text;
//    public Object activityBlocked;
//    public Object avatarHash;
//    public Object avatarUrl;
//    public Object nonPublicAvailable;
//    public Object idMemberReferrer;
//    public Object nonPublic;
}

@JsonIgnoreProperties(ignoreUnknown = true)
class Data {
    public List listBefore;
    public List listAfter;
    public List list;
    public Board board;
    public Card card;
    public Old old;
    public String creationMethod;
    public String text;
    public Date dateLastEdited;
    public String idMember;
    public String idMemberAdded;
//    public String memberType;
//    public Object organization;
//    public boolean deactivated;
//    public Object plugin;
//    public Object attachment;
//    public Object member;
//    public Object textData;
}

@JsonIgnoreProperties(ignoreUnknown = true)
class Old {
    public String name;
    public String desc;
    public Date due;
    public boolean closed;
//    public Object dueComplete;
//    public Object prefs;
//    public Object dueReminder;
//    public Object pos;
//    public Object idList;
//    public Object start;
//    public Object cover;
}

@JsonIgnoreProperties(ignoreUnknown = true)
class Card {
    public String shortLink;
    public int idShort;
    public String name;
    public String id;
    public Date due;
    public String type;
    public String text;
    public String desc;
    public boolean closed;
//    public Object dueComplete;
//    public Object prefs;
//    public Object dueReminder;
//    public Object pos;
//    public Object idList;
//    public Object start;
//    public Object cover;
}

@JsonIgnoreProperties(ignoreUnknown = true)
class Board {
    public String shortLink;
    public String name;
    public String id;
}

@JsonIgnoreProperties(ignoreUnknown = true)
class List {
    public String name;
    public String id;
    public boolean closed;

//    public Object pos;
}
