# Aggressive Liveness Restarts

Liveness probes are configured too aggressively.

Temporary latency spikes or startup delays cause liveness failures.

Kubernetes repeatedly restarts healthy-but-slow workloads.

This creates:
- restart storms
- startup amplification
- dependency overload
- CrashLoopBackOff conditions

The recovery behavior itself destabilizes the platform.

Mitigation:
- startup probes
- relaxed thresholds
- readiness separation
- stabilization timing
