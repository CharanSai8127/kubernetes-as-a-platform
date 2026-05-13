# Startup Storm Overloads Database

A deployment rollout or node recovery event causes multiple backend replicas to start simultaneously.

Each replica:
- initializes clients
- establishes DB connections
- warms caches
- performs dependency checks

The database receives a sudden spike of concurrent requests and connections.

This results in:
- increased latency
- connection exhaustion
- timeout amplification
- retry storms

Eventually:
- readiness probes fail
- pods restart
- cascading failure spreads across the platform

Mitigation:
- maxSurge
- maxUnavailable
- readiness gating
- pre-warming
- rollout pacing
