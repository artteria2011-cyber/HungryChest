# Hungry Chest

A Fabric mod for Minecraft Java 26.1.2 where chests develop appetites.

## Planned features

- Individual hunger/satiety for each chest
- Grumbling sounds and visual warning particles
- Item-specific food values
- Occasional item stealing from nearby containers
- Optional, configurable player-inventory stealing (hotbar protected)
- Chest personalities, animations, eyes and mouth

## Development status

**0.1.0 — project bootstrap.** This repository currently contains the Fabric project scaffold and mod entrypoint. The gameplay mechanics are not implemented yet, and no playable JAR has been published.

## Build requirements

- JDK 25
- Gradle 9.4.0
- Minecraft 26.1.2
- Fabric Loader 0.18.4
- Fabric API 0.155.0+26.1.2

Run:

```bash
gradle build
```

The mod JAR will be generated in `build/libs`.

## Roadmap

1. Persistent hunger data for chest block entities
2. Hunger decay and food-value rules
3. Grumbling and particles
4. Neighbor-chest item transfer
5. Optional player inventory interaction, with hotbar protection
6. Config file and chest personalities
7. Custom chest model and animations

## License

MIT
