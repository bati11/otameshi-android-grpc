//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: hello.proto

package info.bati11.android.otameshi.grpc;

@kotlin.jvm.JvmName("-initializehelloResponse")
public inline fun helloResponse(block: info.bati11.android.otameshi.grpc.HelloResponseKt.Dsl.() -> kotlin.Unit): info.bati11.android.otameshi.grpc.HelloResponse =
  info.bati11.android.otameshi.grpc.HelloResponseKt.Dsl._create(info.bati11.android.otameshi.grpc.HelloResponse.newBuilder()).apply { block() }._build()
public object HelloResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: info.bati11.android.otameshi.grpc.HelloResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: info.bati11.android.otameshi.grpc.HelloResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): info.bati11.android.otameshi.grpc.HelloResponse = _builder.build()

    /**
     * <code>string message = 1;</code>
     */
    public var message: kotlin.String
      @JvmName("getMessage")
      get() = _builder.getMessage()
      @JvmName("setMessage")
      set(value) {
        _builder.setMessage(value)
      }
    /**
     * <code>string message = 1;</code>
     */
    public fun clearMessage() {
      _builder.clearMessage()
    }
  }
}
public inline fun info.bati11.android.otameshi.grpc.HelloResponse.copy(block: info.bati11.android.otameshi.grpc.HelloResponseKt.Dsl.() -> kotlin.Unit): info.bati11.android.otameshi.grpc.HelloResponse =
  info.bati11.android.otameshi.grpc.HelloResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()
