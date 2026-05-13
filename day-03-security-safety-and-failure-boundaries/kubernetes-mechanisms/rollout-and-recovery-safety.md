# Rollout and Recovery Safety

Deployments and recovery events introduce instability into distributed systems.

Controlled rollout behavior reduces startup storms and protects shared dependencies.

## maxUnavailable

maxUnavailable limits how many replicas can become unavailable during rollout.

This protects:
- service availability
- traffic capacity
- dependency stability

## maxSurge

maxSurge limits how many new replicas can start simultaneously.

This reduces:
- startup pressure
- database connection spikes
- dependency overload

## Rolling Updates

Rolling updates replace workloads gradually instead of all at once.

Controlled rollout pacing:
- limits blast radius
- improves observability
- enables safer rollback

## Pre-Warming

Applications should initialize dependencies before receiving traffic.

Examples:
- warming caches
- establishing DB pools
- initializing SDKs

## Graceful Recovery

Recovery itself must be controlled.

Large-scale simultaneous recovery can destabilize:
- databases
- queues
- caches
- shared infrastructure

Healthy systems recover gradually instead of instantly.
