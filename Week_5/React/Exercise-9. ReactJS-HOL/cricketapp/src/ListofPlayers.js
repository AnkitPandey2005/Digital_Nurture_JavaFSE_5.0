function ListofPlayers({ players }) {
  return (
    <div>
      {players.map((player, index) => (
        <li key={index}>
          Mr. {player.name} <span>{player.score}</span>
        </li>
      ))}
    </div>
  );
}

export function ScoreBelow70({ players }) {
  const filteredPlayers = players.filter(player => player.score <= 70);

  return (
    <div>
      {filteredPlayers.map((player, index) => (
        <li key={index}>
          Mr. {player.name} <span>{player.score}</span>
        </li>
      ))}
    </div>
  );
}

export default ListofPlayers;