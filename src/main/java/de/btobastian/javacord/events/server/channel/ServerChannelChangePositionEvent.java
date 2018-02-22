package de.btobastian.javacord.events.server.channel;

import de.btobastian.javacord.entities.channels.ServerChannel;

/**
 * A server channel change position event.
 */
public class ServerChannelChangePositionEvent extends ServerChannelEvent {

    /**
     * The new position of the channel.
     */
    private final int newPosition;

    /**
     * The old position of the channel.
     */
    private final int oldPosition;

    /**
     * Creates a new server channel change position event.
     *
     * @param channel The channel of the event.
     * @param newPosition The new position of the channel.
     * @param oldPosition The old position of the channel.
     */
    public ServerChannelChangePositionEvent(ServerChannel channel, int newPosition, int oldPosition) {
        super(channel);
        this.newPosition = newPosition;
        this.oldPosition = oldPosition;
    }

    /**
     * Gets the new raw position of the channel.
     *
     * @return The new raw position of the channel.
     */
    public int getNewRawPosition() {
        return newPosition;
    }

    /**
     * Gets the old raw position of the channel.
     *
     * @return The old raw position of the channel.
     */
    public int getOldRawPosition() {
        return oldPosition;
    }
}
