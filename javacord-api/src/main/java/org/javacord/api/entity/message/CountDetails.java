package org.javacord.api.entity.message;

public interface CountDetails {

    /**
     * Gets the count of super reactions.
     *
     * @return The count of super reactions.
     */
    int getBurstCount();

    /**
     * Gets the count of normal reactions.
     *
     * @return The count of normal reactions.
     */
    int getNormalCount();
}
