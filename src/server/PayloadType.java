package server;

public enum PayloadType {
	CONNECT, DISCONNECT, MESSAGE, CLEAR_PLAYERS, SYNC_DIRECTION, SYNC_POSITION, CREATE_ROOM, JOIN_ROOM, GET_ROOMS,
	CHOICE, SET_COUNTDOWN
}