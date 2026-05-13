# Health and Traffic Controls

Traffic entering a Kubernetes platform must always be controlled.

Health probes ensure workloads receive traffic only when they are capable of handling production requests safely.

## Readiness Probe

Readiness probes determine whether a pod is ready to receive traffic.

If readiness fails:
- the pod is removed from service discovery
- traffic stops routing to the pod
- the container is not restarted

This protects workloads during:
- startup
- dependency initialization
- cache warming
- rollout transitions

## Liveness Probe

Liveness probes determine whether workloads are still functioning correctly.

If liveness fails:
- Kubernetes restarts the container

Liveness assumes restart is a valid recovery mechanism.

Aggressive liveness configuration can introduce:
- restart storms
- cascading failures
- CrashLoopBackOff conditions

## Startup Probe

Startup probes protect slow-starting applications from premature liveness failures.

This is especially important for:
- JVM workloads
- database-heavy applications
- initialization-heavy services

## Traffic Admission

Traffic must only reach healthy workloads.

Traffic control mechanisms include:
- Gateway API
- ingress controllers
- rate limiting
- readiness gating
- service discovery protection

Healthy systems validate workload stability before traffic admission occurs.
