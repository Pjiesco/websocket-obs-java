package net.twasi.obsremotejava.requests.PreviousMedia;

import net.twasi.obsremotejava.OBSCommunicator;
import net.twasi.obsremotejava.requests.RequestBase;
import net.twasi.obsremotejava.requests.RequestType;

public class PreviousMediaRequest extends RequestBase {
    private String sourceName;

    public PreviousMediaRequest(OBSCommunicator com, String sourceName) {
        super(RequestType.PreviousMedia);

        this.sourceName = sourceName;

        // com.messageTypes.put(getMessageId(), PreviousMediaResponse.class);
    }
}
