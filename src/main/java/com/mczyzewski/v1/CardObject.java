package com.mczyzewski.v1;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class CardObject {
    public String id;
    public String address;
    public Badges badges;
    public List<String> checkItemStates;
    public boolean closed;
    public String coordinates;
    public String creationMethod;
    public Date dateLastActivity;
    public String desc;
    public DescData descData;
    public String due;
    public String dueReminder;
    public String email;
    public String idBoard;
    public List<IdChecklist> idChecklists;
    public List<IdLabel> idLabels;
    public String idList;
    public List<String> idMembers;
    public List<String> idMembersVoted;
    public int idShort;
    public List<String> labels;
    public Limits limits;
    public String locationName;
    public boolean manualCoverAttachment;
    public String name;
    public int pos;
    public String shortLink;
    public String shortUrl;
    public boolean subscribed;
    public String url;
    public Cover cover;
}

class Trello {
    public int board;
    public int card;
}

class AttachmentsByType {
    public Trello trello;
}

class Badges {
    public AttachmentsByType attachmentsByType;
    public boolean location;
    public int votes;
    public boolean viewingMemberVoted;
    public boolean subscribed;
    public String fogbugz;
    public int checkItems;
    public int checkItemsChecked;
    public int comments;
    public int attachments;
    public boolean description;
    public String due;
    public boolean dueComplete;
}

class Emoji {
}

class DescData {
    public Emoji emoji;
}

class IdChecklist {
    public String id;
}

class IdLabel {
    public String id;
    public String idBoard;
    public String name;
    public String color;
}

class PerBoard {
    public String status;
    public int disableAt;
    public int warnAt;
}

class Attachments {
    public PerBoard perBoard;
}

class Limits {
    public Attachments attachments;
}

class Cover {
    public String color;
    public boolean idUploadedBackground;
    public String size;
    public String brightness;
    public boolean isTemplate;
}
