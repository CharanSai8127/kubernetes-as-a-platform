# Bad Configuration Rollout

A configuration change introduces incompatible runtime behavior.

Examples:
- incorrect timeout values
- invalid feature flags
- excessive retry limits
- incompatible dependency configuration

Containers remain healthy from Kubernetes perspective, but application behavior becomes unstable.

This results in:
- retry storms
- dependency overload
- latency amplification
- production outages

Mitigation:
- GitOps
- progressive rollout
- configuration validation
- rollback strategies
