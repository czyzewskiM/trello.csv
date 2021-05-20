package com.mczyzewski;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class CardObject2 {
    public DescData descData;
    public List<Attachment> attachments;
    public List<String> idLabels;
    public String shortUrl;
    public boolean dueComplete;
    public Date dateLastActivity;
    public String idList;
    public List<Object> idMembersVoted;
    public String shortLink;
    public Object creationMethod;
    public Cover cover;
    public int dueReminder;
    public boolean subscribed;
    public double pos;
    public List<Object> idChecklists;
    public List<Object> pluginData;
    public String id;
    public String email;
    //public Limits limits;
    public List<Object> customFieldItems;
    public Object address;
    public String idBoard;
    public Object locationName;
    public Object cardRole;
    public Object coordinates;
    public Date start;
    public Object checkItemStates;
    public String url;
    public List<Label> labels;
    public Badges badges;
    public List<String> idMembers;
    public int idShort;
    public Date due;
    public String idAttachmentCover;
    public boolean isTemplate;
    public String name;
    public boolean closed;
    public boolean manualCoverAttachment;
    public String desc;
}

class Emoji {
}

class DescData {
    public Emoji emoji;
}

class Preview {
    public boolean scaled;
    public int bytes;
    public int width;
    public String _id;
    public String id;
    public String url;
    public int height;
}

class Attachment {
    public Date date;
    public String edgeColor;
    public String fileName;
    public int pos;
    public int bytes;
    public String idMember;
    public String name;
    public List<Preview> previews;
    public boolean isUpload;
    public String mimeType;
    public String id;
    public String url;
    public PerCard perCard;
}

class Scaled {
    public boolean scaled;
    public int bytes;
    public int width;
    public String _id;
    public String id;
    public String url;
    public int height;
}

class Cover {
    public Object idUploadedBackground;
    public String brightness;
    public Object color;
    public String size;
    public String idAttachment;
    public Object idPlugin;
    public String edgeColor;
    public List<Scaled> scaled;
}

class PerCard {
    public int warnAt;
    public int disableAt;
    public String status;
}

class Checklists {
    public PerCard perCard;
}

class Stickers {
    public PerCard perCard;
}

class Limits {
    public Checklists checklists;
    public List<Attachment> attachments;
    public Stickers stickers;
}

class Label {
    public String idBoard;
    public String color;
    public String name;
    public String id;
}

class Trello {
    public int board;
    public int card;
}

class AttachmentsByType {
    public Trello trello;
}

class Badges {
    public int comments;
    public int attachments;
    public AttachmentsByType attachmentsByType;
    public boolean dueComplete;
    public Date start;
    public boolean description;
    public Object checkItemsEarliestDue;
    public boolean subscribed;
    public Date due;
    public boolean viewingMemberVoted;
    public boolean location;
    public int votes;
    public String fogbugz;
    public int checkItems;
    public int checkItemsChecked;
}
